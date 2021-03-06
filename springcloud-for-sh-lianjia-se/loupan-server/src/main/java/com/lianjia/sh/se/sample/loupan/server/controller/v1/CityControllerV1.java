package com.lianjia.sh.se.sample.loupan.server.controller.v1;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.dooioo.se.lorik.spi.view.BeanView;
import com.dooioo.se.lorik.spi.view.support.Views;
import com.lianjia.sh.samples.loupan.spi.CitySpi;
import com.lianjia.sh.samples.loupan.spi.model.City;

@RestController
public class CityControllerV1 implements CitySpi{

  @Override
  public List<City> findAllV1() {
    return null;
  }

  @Override
  public BeanView<City> findByIdV1(int gbCode) {
    return Views.of(new City());
  }
}
