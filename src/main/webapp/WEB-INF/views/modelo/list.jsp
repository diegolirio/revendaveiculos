<!-- Pagina de Lista -->
<aside ng-controller="ModeloListController as mlCtrl" class="right-side" >

	<h3 class="text-info">
		&nbsp; Modelos <small> ( {{mlCtrl.modelos.length}} )</small>
		<a href="#/modelo/edit/0" class="btn btn-default">Nova</a>
	</h3>
	
	<table class="table table-condensed table-hover table-bordered table-striped">
	  	<thead>
	  		<tr>
	  			<th width="50px;">Id</th>
	  			<th>Marca</th>
	  			<th>Descrição</th>
	  			<th>#</th>
	  		<tr>
	  	</thead>
	  	<tbody>
	  		<tr ng-repeat="m in mlCtrl.modelos">
	  			<td>{{m.id}}</td>
	  			<td>{{m.marca.descricao}}</td>
	  			<td><a href="#/modelo/edit/{{m.id}}">{{m.descricao}}</a></td>
	  			<td><a href="#/modelo/edit/{{m.id}}">Alterar</a></td>
	  		</tr>
	  	</tbody>
	</table>	
	
</aside>
