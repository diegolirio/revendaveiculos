<!-- Pagina de Lista -->
<aside ng-controller="MarcaListController as mlCtrl" class="right-side" >

	<a href="#/marca/edit/0" class="btn btn-default">Nova</a>
	
	<h3 class="text-info">
		Marcas <small> ( {{mlCtrl.marcas.length}} )</small>
	</h3>
	
	
</aside>

<!-- <div class="pull-right"> -->
<!-- 	<a href="#/marca/edit/0" class="btn btn-default">Nova</a> -->
<!-- </div> -->

<!-- <div ng-init="loadMarcas()">  -->
	
<!-- 	<h3 class="text-info"> -->
<!-- 		Marcas <small> ( {{marcas.length}} )</small> -->
<!-- 	</h3> -->
	
<!-- 	<div class="col-sm-2" ng-repeat="m in marcas"> -->
<!-- 		<div class="panel panel-default"> -->
<!-- 			<div class="panel-thumbnail"> -->
<!-- 				<center> -->
<!-- 					<img src="{{m.urlImage}}" class="img-responsive"> -->
<!-- 				</center> -->
<!-- 			</div>  -->
<!-- 			<div class="panel-body"> -->
<!-- 				<p class="lead text-center"> -->
<%-- 					<a href="${pageContext.request.contextPath}/#/marca/{{m.id}}">{{m.descricao}} </a> --%>
<!-- 				</p> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->
<!-- 	<!--/col--> -->
	
<!-- </div>	 -->