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
                <td>��ȭ��</td><td><input type="text"></td><td>��ȭ������</td><td><input type="file"></td>
            </tr>
            <tr>
                <td>��������</td><td><select>
                    <option value="0">ī�װ� ����</option>
                    <option value="1">��ȭ1</option>
                    <option value="2">��ȭ2</option>
                    <option value="3">��ȭ3</option>
                </select></td><td>��ȭ�帣</td><td><select>
                    <option value="0">ī�װ� ����</option>
                    <option value="1">��ȭ1</option>
                    <option value="2">��ȭ2</option>
                    <option value="3">��ȭ3</option>
                </select></td>
            </tr>
            <tr>
                <td>�����̸�</td><td><input type="text"/></td><td>������</td><td><input type="date"></td>
            </tr>
            <tr>
                <td>�� ������</td><td><input type="date"></td><td>����Ÿ��</td><td><input type="number"></td>
            </tr>
            <tr>
                <td>����Ÿ��</td><td><input type="number"></td><td>���ϼ�</td><td><input type="number"></td>
            </tr>
            <tr>
                <td>��ȭ ����</td><td colspan="3"><textarea rows="10" style="width: 700px; font-size:20px;"></textarea></td>
            </tr>
            <tr><td><button id="admin_confirm">Ȯ��</button></td></tr>
        </table>
        <br>
    </div>
</div>