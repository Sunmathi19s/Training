import com.example.entity.Product;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ProductClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient();
		
		WebTarget target = client.target("http://localhost:8080/products");
		
		Invocation.Builder builder = target.request(MediaType.APPLICATION_JSON);
		
		Response resp = builder.get();
		
		int ch=4;
		
		if(ch==4) {
			Product[] List=resp.readEntity(Product[].class);
			
			for(Product eachProduct:List) {
				
				System.out.println(eachProduct);
			}
		}
		if(ch==1) {
			//--------------find all-------------
		
			String object=resp.readEntity(String.class);
			System.out.println(object);
		}
		if(ch==2) {
			//-------------find by id -------------
			WebTarget findByIdTarget=target.path("srch/35");
			
			Invocation.Builder builder2 = findByIdTarget.request(MediaType.APPLICATION_JSON);
			
			Response findByresp = builder2.get();
			
		Product object2=findByresp.readEntity(Product.class);
		
		System.out.println(object2);
		}
	
		if(ch==3) {
			//---------add-----------
		Product toAdd=new Product(94, "kicha", 650);
		
		Response response=builder.post(Entity.entity(toAdd, MediaType.APPLICATION_JSON));
		
		System.out.println(response.getStatus());
		
		System.out.println(response.readEntity(String.class));
	}

	}
}