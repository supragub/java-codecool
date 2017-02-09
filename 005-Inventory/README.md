# java-codecool / 005-Inventory

## Inventory Project

Create an application which manages an inventory of products. The application is able to store CD and book products and saves it to an xml document. The structure of the document is well defined.



## Design of the application

classes: Main, StorageManager, CDProduct, BookProduct, PersistentStore

abstract clasess: Product, Store

Interface: StoreCapable

The Main class is responsible for starting the application. It create an instance from the StoreManager class to be able to store products.

You have to add a StoreCapable interface implementation with the addStorage method on the StoreManager instance. After it you are able to add products for storing. Call the addCDProduct method from the main on the StorageManager instance add add the cd parameter in. In the addCDProduct call the storeCDProduct method on the StoreCapable instance that was previously added to the StoreManager.

The Store class is abstract. You call the store method and as parameter give a product that will be created by the createProduct method. The createProduct is implemented in the Store class and the concrete product creation (BookProduct or CDProduuct) depends on the type parameter. It can be "CD" or "Book".

The store method calls the saveToXml method and the store Product method. This solution is a strategy pattern. It means the execution strategy is fixed even if you inherit from it.

The saveToXml method is implemented in the Store abstract class and it saves the incoming product. The form is described below.

The PersistentStore is extends the Stiore class and implements the storeProduct method. The product is stored in the memory.

The StoreCapable instance is able to retrive all the products in a list. Based on it the StoreManager can calculate the total price and the list the stored product names. Behind it you have to load the saved products from your xml file through the PersistentStore that is your StoreCapable implementation.