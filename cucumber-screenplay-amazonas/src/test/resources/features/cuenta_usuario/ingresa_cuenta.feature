@cucumber @humo
Feature: Se logea en amazonas

  Background: Login en Amazonas

  Scenario Outline: Usuario y Clave
    Given que Carla se registra como miembro de amazonas
    #    When she ella se logea con la credenciales validas
    #      | username  | password |
    #      | lcastillo | Cobis456 |
    #    And she coloca las opciones de ingreso la <filial> la <oficina> y la <rol>
    # When she ingresa al aplicativo se valida que estan habilitados los paneles
    When she reliza busqueda en <clase> y <uso> de vehiculo y <fecha_vigencia> y <ano_ini> y <ano_fin> y <cilindraje_ini> y <cilindraje_fin> y <pasajeros_desde> y <pasajeros_hasta> y <tonelaje_ini> y <tonelaje_fin> y <monto>
    And she ella se logea con la credenciales validas
      | username | password |
      | suso     | 123abc   |
    And she coloca las opciones de ingreso la <filial> la <oficina> y la <rol>
#    Then she should see that the first train departs at May 17, 2018

    Examples: 
      | clase | uso  | fecha_vigencia | ano_ini            | ano_fin        | cilindraje_ini | cilindraje_fin | pasajeros_desde | pasajeros_hasta | tonelaje_ini | tonelaje_fin | monto  |filial  | oficina   | rol |
      | Jesus | Niño |    30004562332 | jealniza@gmail.com | KR 45 No 23 54 | Bogota         | Cubndinamarca  |           18061 | COLOMBIA        | suso         | 123abc       | 123abc | London	|	Frankfurt |	25  |
