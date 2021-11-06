package br.org.generation.lojadegames.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojadegames.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
		
		public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
		
		//MySQL: select * from tb_produtos where preco > preco order by preco;
		public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
		
		//MySQL: select * from tb_produtos where preco < preco order by preco desc;
		public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
}
