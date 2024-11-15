$(document).ready(function(){
    $("#loginForm").on("submit", function(){
        var userID = $("input[name='userID']").val();
        var password = $("input[name='password']").val();

        if(userID === "" || password === "") {
            alert("All fields are required.");
            return false;
        }
        return true;
    });
});
