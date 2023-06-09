<%@page import="mul.cam.a.dto.ChatRoomDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
String User = (String)request.getAttribute("User");
ChatRoomDto chatRoomInfo = (ChatRoomDto)request.getAttribute("chatRoomInfo");
%>
<link rel="stylesheet" href="https://bootswatch.com/5/minty/bootstrap.min.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Black+Han+Sans&family=Dongle:wght@300;400;700&family=Jua&family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap" rel="stylesheet">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<style>
*{
	font-family: 'Black Han Sans', sans-serif;
	font-family: 'Dongle', sans-serif;
	font-family: 'Jua', sans-serif;
	font-family: 'Noto Sans KR', sans-serif;
}
body {
	height: 1000px;
}
#sendOption{
	margin-top: 10px;
	text-align: middle;
	height: 20px;
}
#teamChatContainer {
	height: 100%;
	background-color: #fff7e1;
	margin: 0;
	padding-top: 50px;
}
.chatHeader {
	text-align: center;
}
.item-center {
	display:flex;
	justify-content: center;
	align-items: center;
	margin: 30px;
}
.chat-contents-container {
	border: 2px solid black;
	border-radius: 5px;
	box-shadow: 5px 5px 2px 1px gray;
	padding: 10px;
	width: 500px;
	height: 700px;
	overflow: scroll;
	background-color: white;
}
.chat-me {
	display: inline-flex;
	justify-content: flex-start;
	border: 2px solid black;
	border-radius: 5px;
	box-shadow: 0px 5px 2px 1px gray;
	padding: 5px 10px;
	margin: 5px 5px;
}
.chat-other {
	display: inline-flex;
	position: relative;
	right: 5px;
	border: 2px solid black;
	border-radius: 5px;
	box-shadow: 5px 5px 2px 1px gray;
	padding: 5px 10px;
	margin: 5px 5px;
	background-color: gray;
}
.whisper {
	background-color: purple;
	color: white;
	font-weight: bold;
}
</style>

<div id="teamChatContainer" class="item-center">
	<div>
		<div class="chatHeader">
			<h1>[ <%=chatRoomInfo.getTitle() %> ]</h1>
			<br/>
			<p>멤버 : <%=chatRoomInfo.getMembers() %></p>
			<p>호스트 : <%=chatRoomInfo.getCreatedBy() %></p>
		</div>
		<div class="item-center">
			<div class="chat-contents-container">
				<div class="chat-contents">
				</div>
			</div>
		</div>
		<div class="item-center" id="sendOption">
			
			<!-- 
			<div>
				<select id="chatOption" class="form-select" onchange="toChatWho()">
					<option value="toAll">--전체--</option>
					<option value="toOne">--귓속말--</option>
				</select>
				<select id="sendToMember" class="form-select">
				</select>
			</div>
			 -->
			
			<input type="text" class="form-control" size="50" required style="width: 300px; height:45px; font-size:15px;"/>
			<input type="button" class="btn btn-warning" value="전송" onclick="send()" style="width:80px; height: 45px;" />
		</div>
	</div>
</div>

<script>
function loginCheck() {
	if ( "<%=User%>" == "" || "<%=User%>" == "null"){
		location.href= "/BusyBee/loginMain.do";
		alert("로그인 후 이용해주세요");
		return;
	};
};
function memberCheck() {
	let memberList = "<%=chatRoomInfo.getMembers() %>";
	memberList = memberList.split(",");
	const user = "<%=User%>";
	if (!(memberList.includes(user))) {
		location.href= "/BusyBee/loginMain.do";
		alert("팀 멤버만 입장할 수 있습니다.");
		return false;
	}
};
function resizeWindowSize() {
	window.resizeTo(600,900);
}
loginCheck();
memberCheck();
window.addEventListener("resize", resizeWindowSize);
</script>