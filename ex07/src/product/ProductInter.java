package product;
import java.util.*;

public interface ProductInter { //기본틀만잡아줌,,
	public ArrayList<ProductVO>list();
	public void insert(ProductVO vo);
	public boolean delete(String code);
	//public void delete(String code); 자식이생기면 안될수잇으니까 불린으로 리턴,,
	public void update(ProductVO vo);
	public ProductVO read(String code);
	public String getCode();
}
