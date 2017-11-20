<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>首页管理</title>
  <link rel="stylesheet" type="text/css" href="/public/stylesheets/xfback.css" />
  <script type="text/javascript" src="/public/javascripts/jquery-2.0.js"></script>
  <script type="text/javascript" src="/public/javascripts/index.js"></script>
  <script type="text/javascript" src="/public/javascripts/common.js"></script>
</head>
<body>
  <!--头部-->
  <!--首页管理-->
  <div class="xf_ht_t_j_k">
    <!--左边-->
  </div>
  <!--底部-->
  <!--#{include 'supervisor/login/LoginAction/loginBottom.control'/}-->
</body>
<script type="text/javascript">
  $(function() {
    $("input[name='name']").focus();
	var sWidth = $("#focus").width();
	var len = $("#focus ul li").length;
	var index = 0;
	var picTimer;
	var btn = "<div class='btnBg'></div><div class='btn'>";
		btn += "</div><div class='preNext pre'></div><div class='preNext next'></div>";
	$("#focus").append(btn);
	$("#focus .pre").click(function() {
	  index -= 1;
	  if(index == -1) {
	    index = len - 1;
	  }
	  showPics(index);
	});
	$("#focus .next").click(function() {
	  index += 1;
	  if(index == len) {
	    index = 0;
	  }
	  showPics(index);
    });
	$("#focus ul").css("width", sWidth * (len));
	$("#focus").hover(function() {
	    clearInterval(picTimer);
	  },function() {
	    picTimer = setInterval(function() {
		showPics(index);
		index++;
		if(index == len) {
		  index = 0;
		}
		}, 2800);
	  }).trigger("mouseleave");
	  function showPics(index) {
	    var nowLeft = -index * sWidth;
	    $("#focus ul").stop(true, false).animate({"left" : nowLeft}, 300);
	  }
	});
</script>
</html>