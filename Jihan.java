class Jihan {
	public static void main (String[] args) {
		
		int coinNum = args.length  ; 
		int coinChk = 0 ;
		int coinSum = 0 ;
		
		for(int i = 0 ; i < coinNum ; i++){
			coinChk = Integer.parseInt(args[i]) ;
			if(coinChk == 10 || coinChk ==50 || coinChk == 100 || coinChk == 500 ){
				coinSum = coinSum + coinChk ;
	
			}else if( coinChk == 1 || coinChk ==5 ){
				System.out.println("Œx:" + coinChk + "‰~‹Ê‚ÍŽg‚¦‚Ü‚¹‚ñ");
			}else{
				System.out.println("Œx:" + coinChk + "‚Íd‰Ý‚Æ‚µ‚Ä“KØ‚È’l‚Å‚Í‚ ‚è‚Ü‚¹‚ñ");
				
			}
		}
		
	
		System.out.println("‚½‚¾‚¢‚Ü‚Ì“Š“ü‹àŠz‚Í" + coinSum + "‰~‚Å‚·B");
	}
}