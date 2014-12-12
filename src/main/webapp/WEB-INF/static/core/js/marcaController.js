//$app.controller('marcaController', function($scope, $location, $window, $routeParams, $http) {

function marcaController($scope, $location, $window, $routeParams, $http) {

	$scope.loadMarcas = function() {
		$http.get('/revendaveiculos/marca/get/list/json').success(function(data) {
			$scope.marcas = data;
		});
	};
 
	$scope.getMarca = function() {
		if($routeParams.id > 0) {
			$http.get('/revendaveiculos/marca/' + $routeParams.id + "/json").success(function(data) {
				$scope.marca = data;
				$scope.isUpdate = true;
			});
		}
	};
	
	$scope.save = function() {
		if($scope.marca.id > 0) { // update
			$http.post($scope.server("/marca/save/"+$routeParams.id+"/json"), $scope.marca).success(function(data) {
				alert("Alterado com sucesso");
				$location.path("/marca/"+$routeParams.id);
			});
		} else { // insert
			$scope.marca.urlImage = $scope.server("/static/core/img/sem-imagem.gif");
			$http.post($scope.server("/marca/save/0/json"), $scope.marca).success(function(data) {
				$scope.marca = data;
				alert("Salvo com sucesso");
				$location.path("/marca/edit/" + $scope.marca.id); 
			});			
		} 
	};

	$scope.del = function() {
		if (confirm("Deseja excluir " + $scope.marca.descricao + "?")) {
			$http.post($scope.server("/marca/delete/"+$routeParams.id))
				.success(function(data) {
					alert("Excluido com sucesso");
					$location.path("/marca/get/list");
			});
		}
	};	
	
};