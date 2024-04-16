public class Module {
  public class ComplexMethod{public void postItem(Item a)throws ValidationException{if(a.isNew()){if(a.getX()!=null&&a.getY()!=null&&a.getZ()!=null){post(a)}else{throw new ValidationException("incomplete new object")}}else{if(a.getX()<10&&a.getY()>25&&a.getZ()>0){post(a)}else{throw new ValidationException("invalid update")}}}}
}