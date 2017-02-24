package id.co.pegadaian.gadai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.co.pegadaian.gadai.dao.StlDao;
import id.co.pegadaian.gadai.entity.Stl;

@RestController
@RequestMapping("/api/harga")
public class StlController {
	
	@Autowired
	private StlDao stlDao;
	
//	@PreAuthorize("hasAuthority('HARGA_EDIT')")
	@GetMapping("/")
	public Page<Stl> daftarHarga(Pageable page) {
		return stlDao.findAll(page);
	}
}
