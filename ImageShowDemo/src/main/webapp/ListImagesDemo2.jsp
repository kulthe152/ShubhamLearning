<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Display Images</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
		<style>
			body{width: 100%; height: 100%; background: gray; margin: 0;}
			main{width: 100%; height: 100%; position: absolute;} 
			.my_image{ width: 200px; margin: 20px; cursor: crosshair;}
			.my_image:hover{opacity:0.7;}
			#appear_image_div{width:100%; height:100%; position:absolute; z-index:10; opacity:0.7; background:#002447;}
			#appear_image{display:block; margin:auto; position:relative; z-index:10; top:40px; right:10px; left: 100px; bottom: 400px;}
			#close_image{position:fixed; z-index:12; top:20px; right:20px; cursor:pointer;"}
			#close_image:hover{opacity:0.7;}
		</style>
		
		<script type="text/javascript">
			jQuery(function($){
				$('.my_image').click(function(){
					var img= $(this).attr("src");
					var appear_image = "<div id='appear_image_div' onClick='closeImage()'></div>";
					appear_image = appear_image.concat("<img id='appear_image' src='"+img+"' />");
					appear_image = appear_image.concat("<img id='close_image' onClick='closeImage()' src='close.png' />");
					$('body').append(appear_image);
					
				});
			});
			function closeImage(){
				$('#appear_image_div').remove();
				$('#appear_image').remove();
				$('#close_image').remove();
			}
		</script>
	</head>
	<body>
		<main>
			<img class="my_image" src="images/3pic.jpg">
			<img class="my_image" src="images/1pic.jpg">
			<img class="my_image" src="images/2pic.JPG">
			<img class="my_image" src="images/4pic.jpg">
			<img class="my_image" src="images/5pic.jpg">
			<img class="my_image" src="images/6pic.jpg">
			<img class="my_image" src="images/7pic.jpg">
			<img class="my_image" src="images/8pic.jpg">
			<img class="my_image" src="images/9pic.jpg">
			<img class="my_image" src="images/10pic.jpg">
		</main>
	</body>
</html>