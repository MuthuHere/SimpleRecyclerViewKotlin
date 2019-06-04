# SimpleRecyclerViewKotlin
Kotlin Simple RecyclerView withGrid Layout Manager


<p align="center">
  <img src="https://github.com/MuthuHere/SimpleRecyclerViewKotlin/blob/master/device-2019-06-04-141203.png" width="350" height="550" title="hover text">
</p>


So here you need to know the matter `GridLayoutManager`

SPAN_ROW_COUNT is the count number of rows we need and it is an Integer

        rvLoadNumbers.setHasFixedSize(true)
        rvLoadNumbers.layoutManager = GridLayoutManager(this, SPAN_ROW_COUNT)
        rvLoadNumbers.adapter = NumberAdapter(listOfData)
