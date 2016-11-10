<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jstl/sql" %>
<%--
  Created by IntelliJ IDEA.
  User: zagor
  Date: 17.09.2016
  Time: 21:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
        <link rel="stylesheet" href="/resources/css/reset.css" type="text/css" media="all">
        <link rel="stylesheet" href="/resources/css/layout.css" type="text/css" media="all">
        <link rel="stylesheet" href="/resources/css/style.css" type="text/css" media="all">
</head>
<body id="page1">
<div class="body-bg wrap">
        <!-- header -->
        <header>
                <div class="container">
                        <h1><a href="index.html">Zur Alten Ziegelh</a></h1>
                        <div class="indent">
                            <p align="center">Zur Alten Ziegelh&uuml;tte <br />
                                Familie Sch&auml;fer<br />
                                Ziegelh&uuml;tte 1<br />
                                66636 Tholey - Theley<br />
                                tel: 06853 / 40582 -- fax: 06853 / 40582</p>
                            <p align="center">
                                    <nav>
                                            <ul>
                                                    <li><a href="/Scheme"><span>Pub Scheme</span></a></li>
                                                    <li><a href="/employee"><span>Our Employee</span></a></li>
                                                    <li><a href="/scheme_driving"><span>Our Beer</span></a></li>
                                            </ul>
                                    </nav>
                        </div>
                </div>
        </header>
        <!-- content -->
        <section id="content">
                <div class="container">
                        <div class="inside">
                                <div class="indent">
                                        <h2>Menu of Beer</h2>
                                        <ul class="box-list">
                                                <li>
                                                        <div class="box">
                                                                <div class="left-top-corner">
                                                                        <div class="right-top-corner">
                                                                                <div class="border-top"></div>
                                                                        </div>
                                                                </div>
                                                                <div class="xcontent">
                                                                        <div class="border-left">
                                                                                <div class="border-right">
                                                                                        <div class="inner">
                                                                                                <div class="img-box"><img src="/resources/css/icon1.png">
                                                                                                        <h5>Light Beer</h5>
                                                                                                        <p class="p0">
                                                                                                                <c:if test="${!empty PubMenuLight}">
                                                                                                        <table>
                                                                                                                <tr>
                                                                                                                        <th>Name</th>
                                                                                                                        <th>&nbsp;&nbsp;&nbsp;</th>
                                                                                                                        <th>Volume</th>
                                                                                                                        <th>&nbsp;&nbsp;&nbsp;</th>
                                                                                                                        <th>Price</th>
                                                                                                                </tr>
                                                                                                                        <c:forEach items="${PubMenuLight}" var="PubMenuLight">
                                                                                                                <tr>
                                                                                                                        <td><a href="/PubMenuLight?PubMenuLightName=${PubMenuLight.name}">${PubMenuLight.name}</a></td>
                                                                                                                        <td>&nbsp;&nbsp;&nbsp;</td>
                                                                                                                        <td align="center">${PubMenuLight.volume}</td>
                                                                                                                        <td>&nbsp;&nbsp;&nbsp;</td>
                                                                                                                        <td align="center">${PubMenuLight.price}</td>
                                                                                                                </tr>
                                                                                                                </c:forEach>
                                                                                                        </table>
                                                                                                        </c:if>
                                                                                                        </p>
                                                                                                </div>
                                                                                        </div>
                                                                                </div>
                                                                        </div>
                                                                </div>
                                                                <div class="left-bot-corner">
                                                                        <div class="right-bot-corner">
                                                                                <div class="border-bot"><span class="clip-left"></span><span class="clip-right"></span></div>
                                                                        </div>
                                                                </div>
                                                        </div>
                                                </li>
                                                <li>
                                                        <div class="box">
                                                                <div class="left-top-corner">
                                                                        <div class="right-top-corner">
                                                                                <div class="border-top"></div>
                                                                        </div>
                                                                </div>
                                                                <div class="xcontent">
                                                                        <div class="border-left">
                                                                                <div class="border-right">
                                                                                        <div class="inner">
                                                                                                <div class="img-box"><img src="/resources/css/icon2.png">
                                                                                                        <h5>Dark Beer</h5>
                                                                                                        <p class="p0"> <c:if test="${!empty PubMenuDark}">
                                                                                                        <table>
                                                                                                                <tr>
                                                                                                                        <th>Name</th>
                                                                                                                        <th>&nbsp;&nbsp;&nbsp;</th>
                                                                                                                        <th>Volume</th>
                                                                                                                        <th>&nbsp;&nbsp;&nbsp;</th>
                                                                                                                        <th>Price</th>
                                                                                                                </tr>
                                                                                                                <c:forEach items="${PubMenuDark}" var="PubMenuDark">
                                                                                                                        <tr>
                                                                                                                            <td><a href="/PubMenuDark?PubMenuDarkName=${PubMenuDark.name}">${PubMenuDark.name}</a></td>
                                                                                                                                <td>&nbsp;&nbsp;&nbsp;</td>
                                                                                                                                <td align="center">${PubMenuDark.volume}</td>
                                                                                                                                <td>&nbsp;&nbsp;&nbsp;</td>
                                                                                                                                <td align="center">${PubMenuDark.price}</td>
                                                                                                                        </tr>
                                                                                                                </c:forEach>
                                                                                                        </table>
                                                                                                        </c:if>
                                                                                                        </p>
                                                                                                </div>
                                                                                        </div>
                                                                                </div>
                                                                        </div>
                                                                </div>
                                                                <div class="left-bot-corner">
                                                                        <div class="right-bot-corner">
                                                                                <div class="border-bot"><span class="clip-left"></span><span class="clip-right"></span></div>
                                                                        </div>
                                                                </div>
                                                        </div>
                                                </li>
                                                <li>
                                                        <div class="box">
                                                                <div class="left-top-corner">
                                                                        <div class="right-top-corner">
                                                                                <div class="border-top"></div>
                                                                        </div>
                                                                </div>
                                                                <div class="xcontent">
                                                                        <div class="border-left">
                                                                                <div class="border-right">
                                                                                        <div class="inner">
                                                                                                <div class="img-box"><img src="/resources/css/icon3.png">
                                                                                                        <h5>Unfiltered Beer</h5>
                                                                                                        <p class="p0">
                                                                                                                <c:if test="${!empty PubMenuUnfiltered}">
                                                                                                        <table>
                                                                                                                <tr>
                                                                                                                        <th>Name</th>
                                                                                                                        <th>&nbsp;&nbsp;&nbsp;</th>
                                                                                                                        <th>Volume</th>
                                                                                                                        <th>&nbsp;&nbsp;&nbsp;</th>
                                                                                                                        <th>Price</th>
                                                                                                                </tr>
                                                                                                                <c:forEach items="${PubMenuUnfiltered}" var="PubMenuUnfiltered">
                                                                                                                        <tr>
                                                                                                                                <td><a href="/PubMenuUnfiltered?PubMenuUnfilteredName=${PubMenuUnfiltered.name}">${PubMenuUnfiltered.name}</a></td>
                                                                                                                                <td>&nbsp;&nbsp;&nbsp;</td>
                                                                                                                                <td align="center">${PubMenuUnfiltered.volume}</td>
                                                                                                                                <td>&nbsp;&nbsp;&nbsp;</td>
                                                                                                                                <td align="center">${PubMenuUnfiltered.price}</td>
                                                                                                                        </tr>
                                                                                                                </c:forEach>
                                                                                                        </table>
                                                                                                        </c:if>
                                                                                                        </p>
                                                                                                </div>
                                                                                        </div>
                                                                                </div>
                                                                        </div>
                                                                </div>
                                                                <div class="left-bot-corner">
                                                                        <div class="right-bot-corner">
                                                                                <div class="border-bot"></div>
                                                                        </div>
                                                                </div>
                                                        </div>
                                                </li>
                                        </ul>
                                </div>
                        </div>
                </div>
        </section>
</div>
<!-- footer -->
<footer>
        <div class="container">
                <div class="inside"> <a class="new_window" href="http://bayguzin.ru/" target="_blank" ></a> </div>
        </div>
</footer>
<script type="text/javascript"> Cufon.now(); </script>
</body>
</html>
