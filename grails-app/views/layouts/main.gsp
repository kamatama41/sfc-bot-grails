<!doctype html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
		<title><g:layoutTitle default="Super Famicom Bot"/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="${resource(dir: 'images', file: 'favicon.ico')}" type="image/x-icon">
        <r:require modules="bootstrap"/>
		<g:layoutHead/>
        <r:layoutResources />
        <style type="text/css">
        body {
            padding-top: 60px;
            padding-bottom: 40px;
        }
        </style>
	</head>
	<body>
        <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="navbar-inner">
            <div class="container">
                <g:link class="brand" uri="/">SuperFamicom BOT</g:link>
                <div class='container nav-collapse'>
                    <ul class='nav'>
                        <li><g:link url="https://twitter.com/kamatama_41">Author(@kamatama_41)</g:link></li>
                    </ul>
                </div>
            </div>
            </div>
        </div>
        <div class="container">
        <div class="span10">
        <g:layoutBody/>
        </div>
        </div>
		<div class="footer"></div>
		<r:layoutResources />
	</body>
</html>