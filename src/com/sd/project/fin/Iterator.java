package com.sd.project.fin;

public interface Iterator{
  boolean hasNext();
  Object next();//next로 돌려받을때 케스팅을 해줘야함 넓게 돌려받고 있기때문 (object)
}