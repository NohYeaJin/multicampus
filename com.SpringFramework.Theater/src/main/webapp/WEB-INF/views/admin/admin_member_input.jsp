<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css">
<link href="http://fonts.googleapis.com/earlyaccess/nanumgothiccoding.css" rel="stylesheet">
</head>
<body>
	<header>
			<ul>
				<li>login</li>
				<li>signup</li>
				<li>logout</li>
				<li>mypage</li>
			</ul>
	</header>
	<div id="main_bar">
		YJ Theater
	</div>
	<nav>
		<ul>
			<li id="home">Home</li>
			<li><a href="#">About</a></li>
			<li><a href="#">Movies</a></li>
			<li><a href="#">Reservation</a></li>
			<li><a href="#">Facilities</a></li>
			<li id="payment"><a href="#">Payments & discount</a></li>
			<li><a href="#">Contact</a></li>
		</ul>
	</nav>
<div class="container" style="text-align:left; margin-bottom: 20px; margin-top: 20px;">
    <div class="movie_option" style="text-align: left;">
        <table id="options">
            <tr>
                <td>ȸ�� ���̵�</td><td>
                    <input type="text"/><button id="admin_confirm">�ߺ�üũ</button></td>
            </tr>
            <tr>
                <td>�󿵰�</td><td><select>
                    <option value="0">�󿵰� ����</option>
                    <option value="1">1��</option>
                    <option value="2">2��</option>
                    <option value="3">3��</option>
                </select></td>
            </tr>
            <tr>
                <td>��ȭ</td><td><select>
                    <option value="0">��ȭ ����</option>
                    <option value="1">��ȭ1</option>
                    <option value="2">��ȭ2</option>
                    <option value="3">��ȭ3</option>
                </select></td>
            </tr>
            <tr>
                <td>�� ���� �ð�</td><td><input type="date"/><input type="time"/></td>
            </tr>
            <tr>
                <td>���� ���� �¼� ��</td><td><input type="number"></td>
            </tr>
            <tr><td><button id="admin_confirm">Ȯ��</button></td></tr>
        </table>
        <br>
    </div>
</div>