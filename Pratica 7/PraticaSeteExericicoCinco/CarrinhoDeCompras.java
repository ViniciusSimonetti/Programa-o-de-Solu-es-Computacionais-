import java.util.ArrayList;

public class CarrinhoDeCompras
{

        private ArrayList<ItemCarrinho> itens = new ArrayList<>();
        public Object adiciona;

        public void adicionaItem (ItemCarrinho item)
        { itens.add (item); 
        }
        
        public void removeItem(ItemCarrinho item)
        { itens.remove(item);
        }
        

        public double calculaTotal()
        { double total = 0;
            for (ItemCarrinho item : itens)
            { total += item.getPreco();
            }
            return total;
        }

        public void exibeItens(){
            for (ItemCarrinho item : itens) {
                System.out.println(item.getDescricao());
            }
        }
    }  
        
      
        





