<div class="pull-right">
	<a href="#/marca/edit/0" class="btn btn-default">Nova</a>
</div>

<div ng-init="getMarca()" ng-show="marca.id > 0">  
	
	<h3 class="text-info" > 
		{{marca.descricao}} <small><a href="${pageContext.request.contextPath}/#/marca/edit/{{marca.id}}"><span class="text-muted">Editar</span></a></small>
	</h3>
	 
	<div class="col-sm-2" >
		<div class="panel panel-default">
			<div class="panel-thumbnail">
				<center>
					<img src="{{marca.urlImage}}" class="img-responsive">
				</center>
			</div>
			<div class="panel-body"></div>
		</div>
	</div>
	<!--/col-->
	
</div>	