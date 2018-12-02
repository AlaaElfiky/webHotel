
<%@page import="utility.trip_dbase"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
    <title>Conf </title>
    <head>

        <meta charset="utf-8">
        <title>Fullscreen Login</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">

        <!-- CSS -->
        <link type="text/css" rel="stylesheet" href="assets/css/bootstrap.css">
        <link type="text/css" rel="stylesheet" href="assets/css/home.css">
        <script src="html5shiv.min.js"></script>
        <script src="respond.min.js"></script>

        <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700'>
        <link rel="stylesheet" href="assets/css/reset.css">
        <link rel="stylesheet" href="assets/css/supersized.css">
        <link rel="stylesheet" href="assets/css/style.css">


        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
        <!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->

    </head>

    <body style="background:url(assets/img/p.jpg) fixed center center ;background-repeat:no-repeat;background-size: cover">

      
        <div class="page-container1" style="height: 100%; width: 60%;margin: auto ;background:rgba(0,0,0,.6) ;border: none">
            <h1 style="font-style: italic ;font-size: 50px ; margin: auto;margin-top: 100px;">welcome to Remaa</h1>
             <form action="conf_regist" method="get" >
                 <input placeholder="E-mail" name="email" type="text" value="<%=session.getAttribute("email")%>"style="border-radius: 2px;border: 2px solid #fcffc1;padding-right:45px"><br>
                 <input placeholder="Film name" name="film" type="text" style="border-radius: 2px;border: 2px solid #fcffc1;padding-right:45px"><br>

                <button type="submit" class="reg" >Reserve</button>
                
                

                <br/>
                <br/>
                <div class="error"><span>+</span></div>

            </form>
                 
                  

        </div>

        <!-- Javascript -->
        <script src="assets/js/jquery-1.8.2.min.js"></script>
        <script src="assets/js/supersized.3.2.7.min.js"></script>
        <script src="assets/js/supersized-init.js"></script>
        <script src="assets/js/scripts.js"></script>

    </body>
    <script>
                function valid() {
                    if (document.fo.user.value.length < 1) {
                        alert("Please Enter user name");

                        return  false;

                    }
                    if (document.fo.pass.value.length < 1) {
                        alert(" Please Enter password");

                        return  false;

                    }
                }
    </script>
</html>

