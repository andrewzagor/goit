package restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import restaurant.domain.Order;
import restaurant.repository.OrderRepository;

import java.util.List;

/**
 * Created by zagor on 14.11.2016.
 */

@Controller
public class OrderController {
    private OrderRepository orderRepository;


    @Autowired
    public void OrderRepository (OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @RequestMapping(value ="/order_for_admin", method = RequestMethod.GET)
    public String getOrderAdm (Model model) {
        List<Order> orderListAdm = this.orderRepository.listAll();

        model.addAttribute("order", new Order());
        model.addAttribute("order_for_admin", orderListAdm);

        return "order_for_admin";
    }


    @RequestMapping(value = "/add_order", method = RequestMethod.POST)
    public String addOrder(@ModelAttribute("order") Order order, BindingResult result) {

        orderRepository.addOrder(order);

        return "redirect:/order_for_admin";
    }

    @RequestMapping("/deleteOrder/{orderId}")
    public String deleteOrder(@PathVariable("orderId") Integer orderId) {

        orderRepository.removeOrder(orderId);

        return "redirect:/order_for_admin";
    }

    @RequestMapping(value = "/update_order", method = RequestMethod.GET)
    public String updateOrder(@RequestParam("idorderupd") Integer orderId, Model model) {

        Order existingOrder = orderRepository.get(orderId);

        model.addAttribute("orderAttribute", existingOrder);

        return "update_order";
    }

    @RequestMapping(value = "/update_order", method = RequestMethod.POST)
    public String updateOrderPost(@RequestParam("id") Integer orderId, @ModelAttribute("orderAttribute") Order order) {
        order.setId(orderId);
        orderRepository.editOrder(order);
        return "redirect: order_for_admin";
    }
}
