$(function(){
	switch(menu){
	
	case 'View Products':
		$('#listProducts').addClass('active');
		break;
	case 'Contact':
		$('#contact').addClass('active');
		break;
	case 'About Us':
		$('#about').addClass('active');
		break;
	default:
		$('#home').addClass('active');
	}
})