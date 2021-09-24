package com.sgtreinamento.biblioteca.exer3.emprestimos;

import com.sgtreinamento.biblioteca.exer3.usuarios.Usuario;
import com.sgtreinamento.biblioteca.exer3.usuarios.UsuarioService;
import org.apache.catalina.realm.MemoryRealm;
import org.hibernate.internal.util.compare.CalendarComparator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EmprestimoService {

    @Autowired
    private EmprestimoRepo emprestimosREpo;

    @Autowired
    private UsuarioService usuarioService;


    public List<Emprestimo> buscarEmprestimo() {
        return emprestimosREpo.findAll();
    }

    public Emprestimo buscarEmprestimoPeloId(Long id) {
        return emprestimosREpo.findById(id).orElse(null);
    }

    Date date = new Date();


    public Emprestimo adicionarEmprestimo(Emprestimo adicionar) {
        Calendar calendar = Calendar.getInstance();

        int semanaDepois = calendar.get(Calendar.DAY_OF_YEAR) + 7;
        calendar.set(Calendar.DAY_OF_YEAR, semanaDepois);
        adicionar.setDataDevolucao(calendar.getTime());

        return emprestimosREpo.save(adicionar);
    }


    public void devolverLivro(Long id) {
        Emprestimo emprestimo = emprestimosREpo.getById(id);
        Date dataAtual = Calendar.getInstance().getTime();


        if (emprestimo.getDataDevolucao().before(dataAtual)) {

            LocalDate localDateDevolucao = emprestimo.getDataDevolucao().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate localDateAtual = dataAtual.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            Long days = ChronoUnit.DAYS.between(localDateDevolucao, localDateAtual);

        }

    }
}