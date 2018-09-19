<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Popper JS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
<!--
<script>
$(document).ready(function() {
// Check for hash value in URL
    var hash = window.location.hash.substr(1);
    var href = $('#nav li a').each(function(){
        var href = $(this).attr('href');
        if(hash==href.substr(0,href.length-5)){
            var toLoad = hash+'.html #content';
            $('#content').load(toLoad)
        }
    });

    $('#nav li a').click(function(){

    var toLoad = $(this).attr('href')+' #content';
    $('#content').hide('fast',loadContent);
    $('#load').remove();
    $('#wrapper').append('<span id="load">LOADING...</span>');
    $('#load').fadeIn('normal');
    window.location.hash = $(this).attr('href').substr(0,$(this).attr('href').length-5);
    function loadContent() {
     $('#content').load(toLoad,'',showNewContent())
    }
    function showNewContent() {
     $('#content').show('normal',hideLoader());
    }
    function hideLoader() {
     $('#load').fadeOut('normal');
    }
    return false;

    });
});
</script>
-->
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">