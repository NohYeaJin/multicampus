<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en">

<head>
    <!-- Meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Bootstrap 4 Template">
    <meta name="author" content="kingstudio.ro">
    <!-- Favicon -->
    <link rel="icon" href="resources/images/favicon.png">
    <!-- Site Title -->
    <title>Gallerio - Gellery Shop Template</title>
    <!-- Bootstrap 4 core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom Styles -->
    <link href="resources/css/style.css" rel="stylesheet">
    <link href="resources/css/animate.css" rel="stylesheet">
    <!-- Fonts -->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <link href="resources/css/fontawesome-all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Muli:300,400,700" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Montserrat:700" rel="stylesheet">
    <script src="resources/js/ckeditor/ckeditor.js"></script>
    <script src="resources/js/jquery.min.js"></script>

</head>

<body>

<div id="preloader">
    <div class="preloader">
        <span></span>
        <span></span>
    </div>
</div>

<div class="top-menu top-menu-primary">
    <div class="container">
        <p>
                <span class="social margin-fix left">
                    <a class="no-margin" href="#"><i class="fab fa-facebook-f"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-google-plus-g"></i></a>
                    <a href="#"><i class="fab fa-instagram"></i></a>
                    <a href="#"><i class="fab fa-pinterest"></i></a>
                </span>
            <span class="right">
                    <a href="#x" data-toggle="modal" data-target=".login-modal"><i class="fas fa-user mr-1"></i> <span>Login</span></a>
                    <a href="#x" data-toggle="modal" data-target=".register-modal"><i class="fas fa-lock mr-1"></i> <span>Register</span></a>
                </span>
        </p>
    </div><!-- / container -->
</div><!-- / top-menu -->

<nav class="navbar navbar-expand-lg navbar-light bg-white custom-menu split-menu">
    <div class="container">
        <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbar-toggle-1" aria-controls="navbar-toggle-1" aria-expanded="false" aria-label="Toggle navigation">
            <span class="icon-bar top-bar"></span>
            <span class="icon-bar middle-bar"></span>
            <span class="icon-bar bottom-bar"></span>
            <span class="sr-only">Toggle navigation</span>
        </button><!-- / navbar-toggler -->

        <a class="navbar-brand mobile-brand m-auto" href="#x"><img src="resources/images/logo-icon.png" alt=""></a>

        <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#navbar-toggle-2" aria-controls="navbar-toggle-2" aria-expanded="false" aria-label="Toggle navigation">
            <span class="icon-bar top-bar"></span>
            <span class="icon-bar middle-bar"></span>
            <span class="icon-bar bottom-bar"></span>
            <span class="sr-only">Toggle navigation</span>
        </button><!-- / navbar-toggler -->

        <div class="collapse navbar-collapse" id="navbar-toggle-1">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link first-menu-item dropdown-toggle" href="#x" id="dropdown1" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Home</a>
                    <div class="dropdown-menu drop-to-right animated fadeIn fast" aria-labelledby="dropdown1">
                        <a class="dropdown-item" href="index.html">Main Demo</a>
                        <a class="dropdown-item" href="index2.html">Full Width</a>
                        <a class="dropdown-item" href="index3.html">Full Screen</a>
                    </div><!-- / dropdown-menu -->
                </li><!-- / dropdown -->
                <li class="nav-item after-dropdown">
                    <a class="nav-link" href="about.html">About Us</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#x" id="dropdown2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Categories</a>
                    <div class="dropdown-menu drop-to-right animated fadeIn fast" aria-labelledby="dropdown2">
                        <a class="dropdown-item" href="#x">Framed</a>
                        <a class="dropdown-item" href="#x">Print</a>
                        <a class="dropdown-item" href="#x">Digital</a>
                        <a class="dropdown-item" href="#x">Photography</a>
                    </div><!-- / dropdown-menu -->
                </li><!-- / dropdown -->
            </ul><!-- / navbar-nav -->
        </div><!-- / navbar-collapse -->

        <a class="navbar-brand m-auto" href="#x"><img src="resources/images/logo-icon.png" alt=""></a>

        <div class="collapse navbar-collapse" id="navbar-toggle-2">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item">
                    <a class="nav-link" href="blog.html">Blog</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link before-count active" href="contact.html">Contact</a>
                </li>
                <li class="nav-item dropdown extra-dropdowns">
                    <a class="nav-link last-menu-item has-dropdown-toggle dropdown-toggle" href="#x" id="dropdown3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Shopping Cart<span class="count count-primary">2</span></a>
                    <div class="dropdown-menu animated fadeIn fast" aria-labelledby="dropdown3">
                        <div class="cart-small">
                            <img src="resources/images/product-small1.jpg" alt="">
                            <p><a href="#x" class="text-black">Amazing Framed Art</a> <br> <span>1 x $29.99</span></p>
                            <a href="#x"> <i class="md-icon dp14 close-icon">close</i></a>
                        </div><!-- / cart-small -->
                        <div class="cart-small">
                            <img src="resources/images/product-small2.jpg" alt="">
                            <p><a href="#x" class="text-black">Printed Photography</a> <br> <span>1 x $14.99</span></p>
                            <a href="#x"> <i class="md-icon dp14 close-icon">close</i></a>
                        </div><!-- / cart-small -->
                        <p class="text-left cart-small-total"><b>Subtotal: $44.98</b></p>
                        <div class="cart-small-footer text-center">
                            <div class="row">
                                <div class="col-sm-6">
                                    <a href="shopping-cart.html" class="mini-cart-btn"><i class="md-icon dp12 mr-1">shopping_cart</i> <span class="va-middle"><b>VIEW CART</b></span></a>
                                </div><!-- / column -->
                                <div class="col-sm-6">
                                    <a href="checkout.html" class="mini-cart-btn mb-0"><i class="md-icon dp12 mr-1">exit_to_app</i> <span class="va-middle"><b>CHECKOUT</b></span></a>
                                </div><!-- / column -->
                            </div><!-- / row -->
                        </div><!-- / cart-small-footer -->
                    </div><!-- / dropdown-menu -->
                </li><!-- / dropdown -->
            </ul><!-- / navbar-nav -->
        </div><!-- / navbar-collapse -->
    </div><!-- / container -->
</nav><!-- / split-navbar -->

<div class="container">
    <header class="contact-header parallax">
        <div class="header-content dark text-center">
            <h1 class="header-title mb-0">상품 등록</h1>
            <p class="inner-space mb-0">작가님의 작품을 홍보할 멋진 글을 작성해주세요!</p>
        </div><!-- / header-content -->
    </header>
</div><!-- / container -->

<div class="container" style="margin-bottom: 20px; margin-top: 20px;">

    <input type="text" class="form-control border-faded" placeholder="제목(작품명/짧은 소개 문구)" style="margin-bottom: 20px; color:black; font-size: 25px;"><br>

    <div class="category" style="margin-bottom: 20px;">
        <select class="form-control selector shop-option" id="inline-form-select-1">
            <option value="0">카테고리 선택</option>
            <option value="1">그림</option>
            <option value="2">조각품</option>
            <option value="3">공예품</option>
            <option value="4">장식품</option>
        </select>
    </div>

    <div class="product_option">
        <table id="options">
            <tr>
                <td>옵션</td>
                <td>가격</td>
            </tr>
            <tr>
                <td><input type="text" placeholder="옵션1 제목"></td>
                <td><input type="text" placeholder="옵션1 가격(숫자만 기록)"></td>
            </tr>
            <tr>
                <td><input type="text" placeholder="옵션2 제목"></td>
                <td><input type="text" placeholder="옵션2 가격(숫자만 기록)"></td>
            </tr>
            <tr>
                <td><input type="text" placeholder="옵션3 제목"></td>
                <td><input type="text" placeholder="옵션3 가격(숫자만 기록)"></td>
            </tr>

        </table>
        <br>
        <button class="btn btn-primary rectangle" style="margin-bottom: 20px;" onclick="addRow()">옵션 추가</button>
    </div>

    <textarea id="bo_content"></textarea>
    <script type="text/javascript">
        $(function(){
            CKEDITOR.replace('bo_content',{
                height: 500
            });
        });
    </script>

    <button class="btn btn-primary rectangle" style="margin-top: 10px; float:left;">확인</button>
    <button class="btn btn-primary rectangle" style="margin-top: 10px; margin-left: 10px; float:left;">저장</button>

</div>
<div class="spacer-2x">&nbsp;</div>

<div class="footer-widgets">
    <div class="container">
        <div class="row">
            <div class="col-lg-3 text-center">
                <div class="widget">
                    <img src="resources/images/logo-icon.png" alt="logo" class="footer-logo">
                    <p class="mb-3">Vivamus sodales eleifend sem eu malesuada nunc.</p>
                </div><!-- / widget -->
            </div><!-- / column-->

            <div class="col-lg-3 text-center">
                <div class="widget">
                    <h3 class="widget-title">USEFUL LINKS</h3>
                    <ul class="footer-list pl-0 mb-0">
                        <li class="mb-3"><a href="#x">Privacy Policy</a></li>
                        <li class="mb-3"><a href="#x">Terms &amp; Conditions</a></li>
                        <li class="mb-3"><a href="#x">News &amp; Updates</a></li>
                    </ul>
                </div><!-- / widget -->
            </div><!-- / column-->

            <div class="col-lg-3 text-center">
                <div class="widget">
                    <h3 class="widget-title">CATEGORIES</h3>
                    <ul class="footer-list pl-0 mb-0">
                        <li class="mb-3"><a href="#x">Framed</a></li>
                        <li class="mb-3"><a href="#x">Print</a></li>
                        <li class="mb-3"><a href="#x">Digital</a></li>
                    </ul>
                </div><!-- / widget -->
            </div><!-- / column-->

            <div class="col-lg-3 text-center">
                <div class="widget">
                    <h3 class="widget-title">CONTACT US</h3>
                    <ul class="footer-list pl-0 mb-0">
                        <li class="mb-3"><a href="tel:01234567890"><i class="fas fa-phone mr-2"></i> 0123 456 7890</a></li>
                        <li class="mb-3"><a href="mailto:info@youriste.com"><i class="fas fa-envelope mr-2"></i> info@yoursite.com</a></li>
                        <li class="mb-3"><a href="#x"><i class="fab fa-twitter mr-2"></i> @GallerioTwitter</a></li>
                    </ul>
                </div><!-- / widget -->
            </div><!-- / column-->
        </div><!-- / row -->
    </div><!-- / container -->
</div><!-- / footer-widgets -->

<footer class="bg-white">
    <div class="container-fluid text-center">
        <p>© 2018 <b>Gallerio</b> by <a href="https://kingstudio.ro" target="_blank">KingStudio</a>. All Rights Reserved.</p>
    </div><!-- / container-fluid -->
</footer>

<!-- Core JavaScript -->
<script src="resources/js/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
<script src="resources/js/bootstrap.min.js"></script>
<!-- / Core JavaScript -->

<!-- preloader -->
<script src="resources/js/preloader.js"></script>
<!-- / preloader -->

<!-- Contact Form -->
<script src="resources/js/contact-form-validator.min.js"></script>
<script src="resources/js/contact-form.js"></script>
<!-- / Contact Form -->
<script>
    function addRow() {
        // table element 찾기
        const table = document.getElementById('options');

        // 새 행(Row) 추가
        const newRow = table.insertRow();

        // 새 행(Row)에 Cell 추가
        const newCell1 = newRow.insertCell(0);
        const newCell2 = newRow.insertCell(1);

        // Cell에 텍스트 추가
        newCell1.innerHTML = '<input type="text" placeholder="옵션">';
        newCell2.innerHTML = '<input type="text" placeholder="가격">';
    }
</script>
</body>

</html>