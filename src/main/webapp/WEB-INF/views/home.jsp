<aside ng-controller="HomeController as homeCtrl" class="right-side" >
	
	<h2>Veiculos ( {{homeCtrl.veiculos.length}} )</h2>
	<ul>
		<li ng-repeat="v in homeCtrl.veiculos"><a href="#/veiculo/{{v.id}}">{{v.placa}}</a></li>
	</ul>

	<a href="#/new">New</a>
	
	<a href="#/marca/get/list">Marcas</a>

</aside>
