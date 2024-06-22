package PessoaManager.src.main.java.poo.dao;
    
    import org.hibernate.Session;
    import org.hibernate.Transaction;
    import poo.model.Pessoa;
    import poo.util.HibernateUtil;

    public class PessoaDAO {
   
        public void salvar(Pessoa pessoa) {
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                transaction = session.beginTransaction();
                session.save(pessoa);
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        }
    
        public Pessoa consultar(Long id) {
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                return session.get(Pessoa.class, id);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    
        public void atualizar(Pessoa pessoa) {
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                transaction = session.beginTransaction();
                session.update(pessoa);
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        }
    
        public void excluir(Long id) {
            Transaction transaction = null;
            try (Session session = HibernateUtil.getSessionFactory().openSession()) {
                transaction = session.beginTransaction();
                Pessoa pessoa = session.get(Pessoa.class, id);
                if (pessoa != null) {
                    session.delete(pessoa);
                    transaction.commit();
                }
            } catch (Exception e) {
                if (transaction != null) {
                    transaction.rollback();
                }
                e.printStackTrace();
            }
        }
    }
       

