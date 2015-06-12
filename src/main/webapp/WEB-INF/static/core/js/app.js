var app = angular.module('app', ['ngRoute']);

app.config(['$routeProvider', function($routeProvider) {
	
	$routeProvider
		.when('/',      { templateUrl: '/revendaveiculos/paginaInicial' } )
		// usuario
		.when('/login', { templateUrl: '/revendaveiculos/usuario/page/login' })
		// veiculo
		.when('/veiculo/:id', { templateUrl: '/revendaveiculos/veiculo/page/view' } )
		// marca
		.when('/cadastro/marcas', { templateUrl: '/revendaveiculos/marca/get/list' } )
		.when('/marca/edit/:id',       { templateUrl: '/revendaveiculos/marca/form' } );
	
}]);

//SERVER_URL = "/revendaveiculos";
//
//$app = angular.module('app', ['ngRoute']);
// 
//$app.config(function($routeProvider, $httpProvider) {
//
//	$routeProvider
//		.when('/', 			  { templateUrl : SERVER_URL + '/home' })
//		.when('/veiculo/:id', { controller: viewController, templateUrl : SERVER_URL + '/view'})
//		// marca 
//		.when('/marca/get/list', { controller: marcaController, templateUrl: SERVER_URL + '/marca/get/list' })
//		.when('/marca/:id', 	 { controller: marcaController, templateUrl: SERVER_URL + '/marca/view'})
//		.when('/marca/edit/:id', { controller: marcaController, templateUrl: SERVER_URL + '/marca/form'})
//		//.otherwise({redirectTo : '/'})
//		;
//	
//	$httpProvider.responseInterceptors.push(function($q,$rootScope) {
//		
//		return function(promise) {
//			//Always disable loader
//			$rootScope.hideLoader();
//			return promise.then(function(response) {
//				// do something on success
//				return(response);
//			}, function(response) {
//				// do something on error
//				$data = response.data;
//				$error = $data.error;
//				console.error($data);
//				if ($error && $error.text)
//					alert("ERROR: " + $error.text);
//				else {	
//					if (response.status=404)
//						alert("Erro ao acessar servidor. Página não encontrada. Veja o log de erros para maiores detalhes");
//					else
//						alert("ERROR! See log console");
//					}
//				return $q.reject(response);
//			});
//		};
//	});
//
//});
// 
//$app.run(function($rootScope) {
//	
//	
//	$rootScope.showLoaderFlag = false;
//	
//	//Força que o ícone de acesso ao servidor seja ativado
//	$rootScope.showLoader = function() {
//		$rootScope.showLoaderFlag=true;
//	};
//	//Força que o ícone de acesso ao servidor seja desativado
//	$rootScope.hideLoader = function() {
//		$rootScope.showLoaderFlag=false;
//	};
//	//Método que retorna a URL completa de acesso ao servidor.
//	// Evita usar concatenação no conteroller
//	$rootScope.server = function(url) {
//		return SERVER_URL + url;
//	};
//	
//	
//	// TODO Obsoleto
//	$rootScope.veiculos = [ {
//		id : 1,
//		placa : 'EVB5455'
//	}, {
//		id : 2,
//		placa : 'SDC3265'
//	} ];
//	
//});
//
//
//// let's make a startFrom filter
//$app.filter('startFrom', function() {
//	return function(input, start) {
//		if (input==null)
//			return null;
//		start = +start; //parse to int
//		return input.slice(start);
//	};
//});
//
//
//
//
//
//// TODO Obsoleto
//function listController($scope) {
//
//}
//function viewController($scope, $location, $routeParams) {
//
//	$scope.title = "Veiculo ";
//	$scope.veiculoId = $routeParams.id;
//
//	// $scope.veiculoIndex = $scope.veiculos.indexOf($scope.veiculo);
//
//	$scope.save = function() {
//		// $scope.fruits[$scope.fruitIndex]=$scope.fruit;
//		$location.path('/');
//	};
//}
//
