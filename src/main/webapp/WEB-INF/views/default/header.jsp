<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/common/constant.jsp"%>

<style type="text/css">



.main_header {
	background: white;
	border-top: 6px solid #eceef1;
	z-index: 100;
	position: relative;
	min-height: 100px;
}
.main_header .head_container {
	z-index: 100;
	height: 100%;
	max-width: 1080px;
	margin: 0 auto;
	position: relative;
	padding: 0 15px;
}
.main_header .header_logo {
	text-align: left;
	height: 112px;
	left: 0;
	width: 224px;
/*	margin: 35px 0 15px;*/
	position: relative;
	display: inline-block;
	vertical-align: top;
	zoom: 1;
}
.main_header .header_logo h1 {
	position: absolute;
	font-family: 'Henny Penny', sans-serif;
	font-size: 28px;
	color: #002d56;
}

.main_header .header_logo h2 {
	position: absolute;
	top: 55px;
	font-family: 'Henny Penny', sans-serif;
	font-size: 18px;
	color: #002d56;
}


.main_header .header_logo a {
	position: absolute;
	width: 224px;
	height: 136px;
	/*background: url("../resources/img/common/logo.png") no-repeat;*/
}
.main_header .nav {
	position: relative;
	left: 10%;
	text-align: left;
	transition: 0.5s ease-in-out;
	-moz-transition: 0.5s ease-in-out;
	-webkit-transition: 0.5s ease-in-out;
	display: inline-block;
	vertical-align: top;
	zoom: 1;
}
.main_header .nav ul {
	display: inline-block;
	vertical-align: top;
	zoom: 1;
	margin: 0;
	padding: 0;
	list-style: none;
	font-size: 0px;
}
.main_header .nav ul li.features:hover {
	border-top: 6px solid #faa928;
}
.main_header .nav ul li.features:hover a{
	color: #faa928;
}

.main_header .nav ul li.pricing:hover {
	border-top: 6px solid #f27398;
}
.main_header .nav ul li.pricing:hover a{
	color: #f27398;
}

.main_header .nav ul li.learning:hover {
	border-top: 6px solid #56be8e;
}
.main_header .nav ul li.learning:hover a{
	color: #56be8e;
}

.main_header .nav ul li.signup:hover {
	border-top: 6px solid #40aaef;
}

.main_header .nav ul li.signup:hover a {
	color: #40aaef;
}
.main_header .nav ul li.login:hover {
	border-top: 6px solid #40aaef;
}

.main_header .nav ul li.login:hover a {
	color: #40aaef;
}


.main_header .nav ul li.features, .main_header .nav ul li.pricing, .main_header .nav ul li.learning {
	text-transform: uppercase;
}
.main_header .nav ul li {
	display: inline-block;
	vertical-align: top;
	zoom: 1;
	margin-top: -6px;
	position: relative;
	z-index: 0;
	width: 130px;
	text-align: center;
	border-top: 6px solid transparent;
}
.main_header .nav ul a {
	display: block;
	padding: 46px 0px;
	text-decoration: none;
	/*font-family: "Avenir", "Futura", sans-serif;*/
	font-size: 17px;
	font-weight: 800;
	color: #555555;
	letter-spacing: 2px;
	outline: none;
	margin: 0 auto;
	-webkit-font-smoothing: subpixel-antialiased;
}
.main_header .nav ul li.learning {
	transition: margin 0.5s ease-in-out;
	-moz-transition: margin 0.5s ease-in-out;
	-webkit-transition: margin 0.5s ease-in-out;
}

.main_header .nav ul.second {
	margin-left: 90px;
}
.main_header .nav ul li.signup a, .main_header .nav ul li.login a {
	letter-spacing: 1px;
}
.main_header .nav ul li.signup a, .main_header .nav ul li.login a {
	letter-spacing: 1px;
}
</style>

<div class="main_header">
	<div class="head_container">
		<div class="header_logo">
			<h1>Jongsoo Blog</h1>
			<h2>The Creative Edge</h2>
		</div>
		<div class="nav">
			<ul class="first">
				<li class="features">
					<a href="">토렌트</a>
				</li>
				<li class="pricing">
					<a href="">게시판2</a>
				</li>
				<li class="learning">
					<a href="">게시판3</a>
				</li>
			</ul>
			<ul class="second">
				<li class="signup">
					<a href="">Sign Up</a>
				</li>
				<li class="login">
					<a href="" style="padding-right: 0px">Login</a>
				</li>
			</ul>
		</div>
	</div>
</div>