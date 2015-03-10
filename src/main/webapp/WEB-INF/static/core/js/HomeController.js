/**
 * Controller da pagina home
 */	
app.controller('HomeController', ['$scope', function($scope) {

	var self = this;
	
	self.veiculos = [ { "id" : 1,
						"placa" : 'EVB5455' },  
					  
					  { "id" : 2, 
						"placa" : 'SDC3265' } ];
	
}]);