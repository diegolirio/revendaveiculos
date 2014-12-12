//$app.controller('marcaController', function($scope, $location, $window, $routeParams, $http) {

function marcaController($scope, $location, $window, $routeParams, $http) {

	$scope.loadMarcas = function() {
		$http.get('/revendaveiculos/marca/get/list/json').success(function(data) {
			$scope.marcas = data;
		});
	};
 
	$scope.getMarca = function() {
		$http.get('/revendaveiculos/marca/' + $routeParams.id + "/json").success(function(data) {
			$scope.marca = data;
		});
	};
	
};