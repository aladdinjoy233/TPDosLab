package TPDos;

import java.util.*;

public class Directorio {

  private TreeMap<Long, Cliente> agenda = new TreeMap();

  public boolean agregarCliente(Cliente cliente, long telefono) {

    if (agenda.containsKey(telefono)) {
      return false;    
    }

    agenda.put(telefono, cliente);

    return true;
  }

  public Cliente buscarCliente(long telefono) {

    for (Map.Entry<Long, Cliente> cliente : agenda.entrySet()) {

      if (cliente.getKey() == telefono) {
        return cliente.getValue();      
      }
      
    }

    return null;

//    return agenda.get(telefono);

  }

  public ArrayList<Long> buscarTelefono(String apellido) {

    ArrayList<Long> telefonos = new ArrayList();

    for (Map.Entry<Long, Cliente> cliente : agenda.entrySet()) {

        String value = cliente.getValue().getApellido();
        if (value.equalsIgnoreCase(apellido)) {
            telefonos.add(cliente.getKey());
        }

    }
    return telefonos;
  }

  public ArrayList<Cliente> buscarClientes(String ciudad) {

    ArrayList<Cliente> clientes = new ArrayList();

    for (Map.Entry<Long, Cliente> cliente : agenda.entrySet()) {

      String value = cliente.getValue().getCiudad();
      if (value.equalsIgnoreCase(ciudad)) {
        clientes.add(cliente.getValue());
      }
    }

    return clientes;

  }

  public boolean borrarCliente(Long telefono) {

//    if (!agenda.containsKey(telefono)) {
//      return false;
//    }
//
//    agenda.remove(telefono);
//    return true;

    return agenda.remove(telefono) != null;


  }


}
