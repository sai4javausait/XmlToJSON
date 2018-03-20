//POJO class which contains 
    // dm, costructor, setter n getter

package jaxb;
import javax.xml.bind.annotation.*;

@XmlType(propOrder = {
	    "inverntoryOrganizationId",
	    "itemId",
	    "productClassId",
	    "unitOfMeasureId",
	    "nodeId",
	    "supplyId",
	    "arrivalDate",
	    "isFinite",
	    "referenceDetails",
	    "quantity"
	})
@XmlRootElement
public class Supply {
	
	private String inverntoryOrganizationId, itemId, productClassId, unitOfMeasureId, 
					nodeId, supplyId, arrivalDate, isFinite, quantity;

	private ReferenceDetails referenceDetails;
	
	public String getInverntoryOrganizationId() {
		return inverntoryOrganizationId;
	}
	public void setInverntoryOrganizationId(String inverntoryOrganizationId) {
		this.inverntoryOrganizationId = inverntoryOrganizationId;
	}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	
	public String getProductClassId() {
		return productClassId;
	}
	public void setProductClassId(String productClassId) {
		this.productClassId = productClassId;
	}
	
	public String getUnitOfMeasureId() {
		return unitOfMeasureId;
	}
	public void setUnitOfMeasureId(String unitOfMeasureId) {
		this.unitOfMeasureId = unitOfMeasureId;
	}
	
	public String getNodeId() {
		return nodeId;
	}
	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}
	
	public String getSupplyId() {
		return supplyId;
	}
	public void setSupplyId(String supplyId) {
		this.supplyId = supplyId;
	}
	
	public String getArrivalDate() {
		return arrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		this.arrivalDate = arrivalDate;
	}
	
	public String getIsFinite() {
		return isFinite;
	}
	public void setIsFinite(String isFinite) {
		this.isFinite = isFinite;
	}
	
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public ReferenceDetails getReferenceDetails() {
		return referenceDetails;
	}
	public void setReferenceDetails(ReferenceDetails referenceDetails) {
		this.referenceDetails = referenceDetails;
	}
	
	public Supply(String inverntoryOrganizationId, String itemId, String productClassId, String unitOfMeasureId,
			String nodeId, String supplyId, String arrivalDate, String isFinite, String quantity,
			ReferenceDetails referenceDetails) {
		super();
		this.inverntoryOrganizationId = inverntoryOrganizationId;
		this.itemId = itemId;
		this.productClassId = productClassId;
		this.unitOfMeasureId = unitOfMeasureId;
		this.nodeId = nodeId;
		this.supplyId = supplyId;
		this.arrivalDate = arrivalDate;
		this.isFinite = isFinite;
		this.quantity = quantity;
		this.referenceDetails = referenceDetails;
	}
	public Supply() {
		super();
	}
	

}
