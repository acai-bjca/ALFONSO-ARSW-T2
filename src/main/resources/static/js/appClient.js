appClient2 = (function () {
    return {      
        getCiudadByName: function (name, callback) {
            //alert( "Load was performed." );
            alert("dsadadsadsad");
            $.get('/cities/'+name, function(data){
                alert(data);
                var ciuadObj = JSON.parse(data);
                callback(ciuadObj);
            });
        }
    };
})();