package co.cristian.springboot.quileiaapi.models.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "restaurante")
public class Restaurante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "razon_social")
	private String razonSocial;

	@Column(name = "nombre_comercial")
	private String nombreComercial;

	@Column(name = "tipo_de_restaurante")
	private Integer tipoDeRestaurante;

	@Column(name = "ciudad_de_ubicacion")
	private String ciudadDeUbicacion;

	@Column(name = "hora_apertura")
	private String horaApertura;

	@Column(name = "hora_cierre")
	private String horaCierre;

	@ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "restaurante_menu", joinColumns = @JoinColumn(name = "restaurante_id"), inverseJoinColumns = @JoinColumn(name = "menu_id"))
	private Set<Menu> menus = new HashSet<>();

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public Integer getTipoDeRestaurante() {
		return tipoDeRestaurante;
	}

	public void setTipoDeRestaurante(Integer tipoDeRestaurante) {
		this.tipoDeRestaurante = tipoDeRestaurante;
	}

	public String getCiudadDeUbicacion() {
		return ciudadDeUbicacion;
	}

	public void setCiudadDeUbicacion(String ciudadDeUbicacion) {
		this.ciudadDeUbicacion = ciudadDeUbicacion;
	}

	public String getHoraApertura() {
		return horaApertura;
	}

	public void setHoraApertura(String horaApertura) {
		this.horaApertura = horaApertura;
	}

	public String getHoraCierre() {
		return horaCierre;
	}

	public void setHoraCierre(String horaCierre) {
		this.horaCierre = horaCierre;
	}

	public Set<Menu> getMenus() {
		return menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Restaurante(String razonSocial, String nombreComercial, Integer tipoDeRestaurante, String ciudadDeUbicacion,
			String horaApertura, String horaCierre) {
		this.razonSocial = razonSocial;
		this.nombreComercial = nombreComercial;
		this.tipoDeRestaurante = tipoDeRestaurante;
		this.ciudadDeUbicacion = ciudadDeUbicacion;
		this.horaApertura = horaApertura;
		this.horaCierre = horaCierre;
	}

	public Restaurante() {

	}

	public void addMenu(Menu menu) {

		menus.add(menu);

		menu.getRestaurantes().add(this);

	}

	public void deleteMenu(Menu menu) {

		menus.remove(menu);

		menu.getRestaurantes().remove(this);

	}

}
