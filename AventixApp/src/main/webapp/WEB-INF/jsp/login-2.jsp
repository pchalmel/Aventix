<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Aventix connexion by SoftDesign</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="robots" content="all,follow">
    <!-- Bootstrap CSS-->
    <link rel="stylesheet" href="vendor/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome CSS-->
    <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
    <!-- Fontastic Custom icon font-->
    <link rel="stylesheet" href="css/fontastic.css">
    <!-- Google fonts - Roboto -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700">
    <!-- jQuery Circle-->
    <link rel="stylesheet" href="css/grasp_mobile_progress_circle-1.0.0.min.css">
    <!-- Custom Scrollbar-->
    <link rel="stylesheet" href="vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.css">
    <!-- theme stylesheet-->
    <link rel="stylesheet" href="css/style.default.premium.css" id="theme-stylesheet">
    <!-- Custom stylesheet - for your changes-->
    <link rel="stylesheet" href="css/custom.css">
    <!-- Favicon-->
    <link rel="shortcut icon" href="img/favicon.ico">
    <!-- Tweaks for older IEs--><!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->
  </head>
  <body>
    <div class="container-fluid px-3">
      <div class="row min-vh-100">
        <div class="col-md-5 col-lg-6 col-xl-4 px-lg-5 d-flex align-items-center">
          <div class="w-100 py-5">
            <div class="text-center"><img src="img/brand/Aventix_logo.jpg" alt="..." style="max-width: 6rem;" class="img-fluid mb-4">
              <h1 class="display-4 mb-3">Se Connecter</h1>
            </div>
            <form method="post" class="form-validate">
              <div class="form-group">
                <label>Email </label>
                <input name="loginUsername" type="email" placeholder="name@address.com" autocomplete="off" required data-msg="Please enter your email" class="form-control">
              </div>
              <div class="form-group mb-4">
                <div class="row">
                  <div class="col">
                    <label>Mot de passe </label>
                  </div>
                  <div class="col-auto"><a href="#" class="form-text small text-muted">vous avez oubliez votre mot de passe?</a></div>
                </div>
                <input name="loginPassword" placeholder="Password" type="password" required data-msg="Please enter your password" class="form-control">
              </div>
              <!-- Submit-->
              <button class="btn btn-lg btn-block btn-primary mb-3">Se Connecter</button>
              <!-- Link-->
              <p class="text-center"><small class="text-muted text-center">Vous n'avez pas encore de compte? <a href="register-2.html">Rejoignez-nous</a>.</small></p>
            </form>
          </div>
        </div>
        <div class="col-12 col-md-7 col-lg-6 col-xl-8 d-none d-lg-block">
          <!-- Image-->
          <div style="background-image: url(img/photos/back3.png);" class="bg-cover h-100 mr-n3"></div>
        </div>
      </div>
    </div>
    <!-- JavaScript files-->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper.js/umd/popper.min.js"> </script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="js/grasp_mobile_progress_circle-1.0.0.min.js"></script>
    <script src="vendor/jquery.cookie/jquery.cookie.js"> </script>
    <script src="vendor/chart.js/Chart.min.js"></script>
    <script src="vendor/jquery-validation/jquery.validate.min.js"></script>
    <script src="vendor/malihu-custom-scrollbar-plugin/jquery.mCustomScrollbar.concat.min.js"></script>
    <!-- Main File-->
    <script src="js/front.js"></script>
  </body>
</html>