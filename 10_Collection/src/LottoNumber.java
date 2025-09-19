import java.util.HashSet;

public class LottoNumber {
		
	public HashSet lotto(HashSet lottoNumber){
		while(lottoNumber.size()<6){
			lottoNumber.add((int)(Math.random()*45) +1);
		}
		
		return lottoNumber;

	}
}
