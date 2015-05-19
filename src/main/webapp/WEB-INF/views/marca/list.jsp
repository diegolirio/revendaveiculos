<!-- Pagina de Lista -->
<aside ng-controller="MarcaListController as mlCtrl" class="right-side" >

	<h3 class="text-info">
		&nbsp; Marcas <small> ( {{mlCtrl.marcas.length}} )</small>
		<a href="#/marca/edit/0" class="btn btn-default">Nova</a>
	</h3>
	
	<table class="table table-condensed table-hover table-bordered table-striped">
	  	<thead>
	  		<tr>
	  			<th width="50px;">Id</th>
	  			<th width="100px;"></th>
	  			<th>Descrição</th>
	  		<tr>
	  	</thead>
	  	<tbody>
	  		<tr ng-repeat="m in mlCtrl.marcas">
	  			<td>{{m.id}}</td>
	  			<td><img src="{{m.urlImage}}" class="img-responsive img-circle" width="40"/></td>
	  			<td>{{m.descricao}}</td>
	  		</tr>
	  	</tbody>
	</table>	
	
</aside>
