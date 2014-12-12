<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html ng-app="app">
	<head>
		<meta charset="utf-8">
		<title>Home</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootswatch-simplex/css/bootstrap.css" media="screen">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/static/bootswatch-simplex/css/bootswatch.min.css">
		<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
		<!--[if lt IE 9]>
		<script src="../bower_components/html5shiv/dist/html5shiv.js"></script>
		<script src="../bower_components/respond/dest/respond.min.js"></script>
		<![endif]-->
		<script>
			var _gaq = _gaq || [];
			_gaq.push([ '_setAccount', 'UA-23019901-1' ]);
			_gaq.push([ '_setDomainName', "bootswatch.com" ]);
			_gaq.push([ '_setAllowLinker', true ]); 
			_gaq.push([ '_trackPageview' ]);
			(function() {
				var ga = document.createElement('script');
				ga.type = 'text/javascript';
				ga.async = true;
				ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www')
							+ '.google-analytics.com/ga.js';
				var s = document.getElementsByTagName('script')[0];
				s.parentNode.insertBefore(ga, s);
			})();
		</script>
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.1.4/angular.min.js"></script>
		<script src="${pageContext.request.contextPath}/static/core/js/app.js"></script>
		<script src="${pageContext.request.contextPath}/static/core/js/marcaController.js"></script>
	</head>
<body>
	<div class="navbar navbar-default navbar-fixed-top navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a href="index.html" class="navbar-brand">Veiculos</a>
				<button class="navbar-toggle" type="button" data-toggle="collapse"
					data-target="#navbar-main">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="navbar-collapse collapse" id="navbar-main">
				<ul class="nav navbar-nav">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#" id="themes">Themes <span
							class="caret"></span></a>
						<ul class="dropdown-menu" aria-labelledby="themes">
							<li><a href="../default/">Default</a></li>
							<li class="divider"></li>
							<li><a href="../cerulean/">Cerulean</a></li>
							<li><a href="../cosmo/">Cosmo</a></li>
						</ul></li>
					<li><a href="../help/">Help</a></li>
					<li><a href="http://news.bootswatch.com">Blog</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#" id="download">Download <span
							class="caret"></span></a>
						<ul class="dropdown-menu" aria-labelledby="download">
							<li><a href="./bootstrap.min.css">bootstrap.min.css</a></li>
							<li><a href="./bootstrap.css">bootstrap.css</a></li>
							<li class="divider"></li>
							<li><a href="./variables.less">variables.less</a></li>
							<li><a href="./bootswatch.less">bootswatch.less</a></li>
							<li class="divider"></li>
							<li><a href="./_variables.scss">_variables.scss</a></li>
							<li><a href="./_bootswatch.scss">_bootswatch.scss</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#" id="themes">Cadastros <span
							class="caret"></span></a>
						<ul class="dropdown-menu" aria-labelledby="themes">
							<li><a href="/">Veiculos</a></li>
							<li class="divider"></li>
							<li><a
								href="${pageContext.request.contextPath}/#/marca/get/list">Marcas</a></li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#" id="themes"> <img src="#" /> <span
							class="caret"></span>
					</a>
						<ul class="dropdown-menu" aria-labelledby="themes">
							<li><a href="#">Perfil</a></li>
							<li class="divider"></li>
							<li><a href="#">Sair</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</div>
	<br/>
	<div class="container">
		<div class="page-header" id="banner">
			<div class="row">
				<div class="col-lg-8 col-md-7 col-sm-6">
					<h1>Tecno Veiculos</h1>
					<p class="lead">Veiculos novos e seminovos</p>
				</div>
				<div class="col-lg-4 col-md-5 col-sm-6">
					<div class="sponsor">
						<!-- <a href="http://gridgum.com/themes/category/bootstrap-themes/?utm_source=Bootswatch&utm_medium=250ad&utm_campaign=Bootswatch%20Campaign" target="_blank" onclick="_gaq.push(['_trackEvent', 'banner', 'click', 'gridgum']);"><img src="http://bootswatch.com/assets/img/gridgum.png" alt="Gridgum" onload="_gaq.push(['_trackEvent', 'banner', 'impression', 'gridgum']);"></a> -->
						<img src="${pageContext.request.contextPath}/static/core/img/159.GIF" ng-show="showLoaderFlag"/>
					</div>
				</div>
			</div>
		</div> 
		<div ng-view></div>
	</div>
	<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
	<script src="${pageContext.request.contextPath}/static/bootswatch-simplex/js/bootstrap.min.js"></script>
	<script	src="${pageContext.request.contextPath}/static/bootswatch-simplex/js/bootswatch.js"></script>
</body>
</html>