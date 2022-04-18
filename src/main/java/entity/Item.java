package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private String shortName;
	
	private String country;
	
	private Date validFrom;
	
	private Long amount;
	
	private Double valBuy;
	
	private Double valSell;
	
	private Double valMid;
	
	private Double currBuy;
	
	private Double currSell;
	
	private Double currMid;
	
	private Double move;
	
	private Double cnbMid;
	
	private Long version;
	
	public Item(String name, String shortName, String country, Date validFrom, Long amount, Double valBuy,
			Double valSell, Double valMid, Double currBuy, Double currSell, Double currMid, Double move, Double cnbMid,
			Long version) {
		super();
		this.name = name;
		this.shortName = shortName;
		this.country = country;
		this.validFrom = validFrom;
		this.amount = amount;
		this.valBuy = valBuy;
		this.valSell = valSell;
		this.valMid = valMid;
		this.currBuy = currBuy;
		this.currSell = currSell;
		this.currMid = currMid;
		this.move = move;
		this.cnbMid = cnbMid;
		this.version = version;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getValidFrom() {
		return validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Double getValBuy() {
		return valBuy;
	}

	public void setValBuy(Double valBuy) {
		this.valBuy = valBuy;
	}

	public Double getValSell() {
		return valSell;
	}

	public void setValSell(Double valSell) {
		this.valSell = valSell;
	}

	public Double getValMid() {
		return valMid;
	}

	public void setValMid(Double valMid) {
		this.valMid = valMid;
	}

	public Double getCurrBuy() {
		return currBuy;
	}

	public void setCurrBuy(Double currBuy) {
		this.currBuy = currBuy;
	}

	public Double getCurrSell() {
		return currSell;
	}

	public void setCurrSell(Double currSell) {
		this.currSell = currSell;
	}

	public Double getCurrMid() {
		return currMid;
	}

	public void setCurrMid(Double currMid) {
		this.currMid = currMid;
	}

	public Double getMove() {
		return move;
	}

	public void setMove(Double move) {
		this.move = move;
	}

	public Double getCnbMid() {
		return cnbMid;
	}

	public void setCnbMid(Double cnbMid) {
		this.cnbMid = cnbMid;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
	
	
}
