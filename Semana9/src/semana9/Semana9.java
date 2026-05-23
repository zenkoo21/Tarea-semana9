package semana9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import semana9.ejercicio1.Cliente;
import semana9.ejercicio1.Prestamo;
import semana9.ejercicio2.DetalleDeProducto;
import semana9.ejercicio2.MateriaPrima;
import semana9.ejercicio3.Producto;
import semana9.ejercicio3.Categoria;
import semana9.ejercicio3.Juridico;
import semana9.ejercicio3.Natural;
import semana9.ejercicio3.Pedido;
import semana9.ejercicio3.PedidoDetalle;
import semana9.ejercicio3.Personal;
import semana9.ejercicio3.Puesto;


public class Semana9 {
    

    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio1();
        //Ejercicio2();
        Ejercicio3();
    }
    
    static void Ejercicio1 ()
    {
        Cliente c = new Cliente();
        c.setNombres("Jorge");
        c.setApellidos("Perez");
        c.setDireccion("Av. Lima 123");
        c.setTelefono("987654321");
        
        Prestamo p1 = new Prestamo (1,1500.43,LocalDate.of(2026, 5, 10),c);
        Prestamo p2 = new Prestamo (2,1700.89,LocalDate.of(2026, 5, 20),c);
        Prestamo p3 = new Prestamo (3,2445.64,LocalDate.of(2026, 6, 10),c);
        
        List<Prestamo> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
            
            if (lista.get(i).getCliente().getIdcliente() == 1)
            {
                
            }
        }
    }
    
    static void Ejercicio2 ()
    {
        Producto p1 = new Producto(1,"Producto A", 50.00, 250.00);
        Producto p2 = new Producto(2,"Producto B",85.15,160.44);
        Producto p3 = new Producto(3,"Producto B",115.78,289.13);
        
        MateriaPrima m1 = new MateriaPrima(1,"Materia A");
        MateriaPrima m2 = new MateriaPrima(2,"Materia B");
        
        DetalleDeProducto dp1 = new DetalleDeProducto(5.45,p1,m1);
        DetalleDeProducto dp2 = new DetalleDeProducto(3.12,p1,m2);
        DetalleDeProducto dp3 = new DetalleDeProducto(1.00,p2,m1);
        DetalleDeProducto dp4 = new DetalleDeProducto(7.11,p3,m2);
        
        List<DetalleDeProducto> lista = new ArrayList<>();
        lista.add(dp1);
        lista.add(dp2);
        lista.add(dp3);
        lista.add(dp4);
        
        for(int i = 0; i<lista.size();i++)
        {
            if(lista.get(i).getMateria().getIdmateriaPrima() == 1)
            {
                System.out.println(lista.get(i).toString());
            }
                      
        }
    }
    
    static void Ejercicio3()
    {
        // Categorías
        Categoria categoria1 = new Categoria("Electrónicos");
        Categoria categoria2 = new Categoria("Limpieza");

        // Productos
        Producto producto1 = new Producto("Laptop", 3500.0, "Activo", categoria1);
        Producto producto2 = new Producto("Mouse", 80.0, "Activo", categoria1);
        Producto producto3 = new Producto("Detergente", 15.0, "Activo", categoria2);

        // Cliente natural
        Natural clienteNatural = new Natural("Pérez", "Juan",new Date(),"12345678","M","Av. Lima 123","987654321","juan@gmail.com");
        // Cliente jurídico
        Juridico clienteJuridico = new Juridico("20123456789","Empresa SAC","123-456","Carlos López","Av. Industrial 456","999888777","empresa@gmail.com");
        // Puesto
        Puesto puesto1 = new Puesto("Vendedor", 1500.0);

        // Personal
        Personal jefe = new Personal("Gómez","Luis","87654321",new Date(),puesto1,null);

        Personal empleado = new Personal("Ramírez","Ana","11223344",new Date(),puesto1,jefe);

        // Pedido
        Pedido pedido1 = new Pedido(new Date(), true, clienteNatural, empleado);

        // Detalles del pedido
        PedidoDetalle detalle1 = new PedidoDetalle(3500.0, 1, producto1, pedido1);
        PedidoDetalle detalle2 = new PedidoDetalle(80.0, 2, producto2, pedido1);

        pedido1.agregarDetalle(detalle1);
        pedido1.agregarDetalle(detalle2);

        // Mostrar datos
        System.out.println(clienteNatural);
        System.out.println(clienteJuridico);
        System.out.println(producto1);
        System.out.println(producto2);
        System.out.println(producto3);
        System.out.println(jefe);
        System.out.println(empleado);
        System.out.println(pedido1);
    }
    
    
}
