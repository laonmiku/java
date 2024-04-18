package sale;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date; //포멧주려면 sql말고 util에서 데려와야함

import product.ProductVO;

//상속받으려면 >extends ~<하고 ~를 임포트해주면 됨..
public class SaleVO extends ProductVO{
	private int seq;
	private String code;
	private String sale_date;
	private int qnt;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSale_date() {
		return sale_date;
	}
	public void setSale_date(String sale_date) {
		this.sale_date = sale_date;
	}
	public int getQnt() {
		return qnt;
	}
	public void setQnt(int qnt) {
		this.qnt = qnt;
	}
	@Override
	public String toString() {
		//포멧을주면 스트링으로 바뀜,,
		DecimalFormat df=new DecimalFormat("#,###원");
		String fmtPrice=df.format(getPrice()); //데이트타입을 스트링으로 바꿔버림 
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년MM월dd일");
		//String fmtDate = sdf.format(sale_date); //인트타입을 스트링으로 바꾸버림
		int sum=getPrice()*qnt;
		String fmtSum=df.format(sum);
		return " 상품코드=" + code + ", 판매일=" + getSale_date() + ", 판매수량=" + qnt + ", 상품이름="
				+ getName() + ", 상품가격=" + fmtPrice+ ", 상품금액="+ fmtSum;
	}
	//상속하면 tostr() 여는곳에서 마지막에 >>inherited method 에서 가져올거 체크해주면 됨,,
	
	
}