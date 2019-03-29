appClient = (function () {
    return {      
        getCiudadByName: function (name, callback) {
            //alert( "Load was performed." );
            alert("dsadadsadsad");
            $.get( '/cities/'+name, function( data ) {
                alert("CASDSADSADSAD");
            //alert( "Load was performed sfsgsgd." );
                console.log(data);
                alert(data);
                var ciuadObj = JSON.parse(data);
                callback(data);
            });
        }
    };
})();