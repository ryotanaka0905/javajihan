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
				System.out.println("�x��:" + coinChk + "�~�ʂ͎g���܂���");
			}else{
				System.out.println("�x��:" + coinChk + "�͍d�݂Ƃ��ēK�؂Ȓl�ł͂���܂���");
				
			}
		}
		
	
		System.out.println("�������܂̓������z��" + coinSum + "�~�ł��B");
	}
}