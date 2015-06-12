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
	  			<th>Descri��o</th>
	  			<th>#</th>
	  		<tr>
	  	</thead>
	  	<tbody>
	  		<tr ng-repeat="m in mlCtrl.marcas">
	  			<td>{{m.id}}</td>
	  			<td><img src="{{m.urlImage}}" class="img-responsive img-circle" width="40"/></td>
	  			<td><a href="#/marca/edit/{{m.id}}">{{m.descricao}}</a></td>
	  			<td><a href="#/marca/edit/{{m.id}}">Alterar</a></td>
	  		</tr>
	  	</tbody>
	</table>	
	
</aside>
