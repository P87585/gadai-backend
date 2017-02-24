package id.co.pegadaian.gadai.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "stl")
public class Stl {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@NotNull @Min(0)
    @Column(name = "harga_emas", nullable = false)
    private BigDecimal hargaEmas;
	
	@NotNull @Min(0)
    @Column(name = "harga_perak", nullable = false)
    private BigDecimal hargaPerak;
	
	@NotNull
    @Column(name = "tanggal_berlaku", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date tanggalBerlaku;
	
	@Size(max=255)
	@Column(name = "keterangan", length=255)
	private String keterangan;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getHargaEmas() {
		return hargaEmas;
	}

	public void setHargaEmas(BigDecimal hargaEmas) {
		this.hargaEmas = hargaEmas;
	}

	public BigDecimal getHargaPerak() {
		return hargaPerak;
	}

	public void setHargaPerak(BigDecimal hargaPerak) {
		this.hargaPerak = hargaPerak;
	}

	public Date getTanggalBerlaku() {
		return tanggalBerlaku;
	}

	public void setTanggalBerlaku(Date tanggalBerlaku) {
		this.tanggalBerlaku = tanggalBerlaku;
	}

	public String getKeterangan() {
		return keterangan;
	}

	public void setKeterangan(String keterangan) {
		this.keterangan = keterangan;
	}

	
	
}
