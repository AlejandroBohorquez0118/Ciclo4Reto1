


function userlogging(){

        userEmail = $("#userName").val(),
        userName = $("#userPass").val(),
   
    $.ajax({    

        url: 'http://localhost:8080/api/user/'+userEmail+'/'+userName,
        
        type: 'GET',
        dataType : 'JSON',
        contentType:'application/json',
        
        
        success : function(json, textStatus, xhr) {
         
                console.log(json);
                
                if(json.id == null){

                    alert('favor ingresar un correo valido')

                }else{

                    location.href="http://localhost:8080/succesInterface.html";
                

                }


        
            },
        
        
        complete : function(xhr, status) {
                //alert('Petición realizada '+xhr.status);


            }
    });
}