package com.joao_marcos.projetos.crud_pratica.repository;

import com.joao_marcos.projetos.crud_pratica.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
