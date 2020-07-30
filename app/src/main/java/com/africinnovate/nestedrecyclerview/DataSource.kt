package com.africinnovate.nestedrecyclerview

class DataSource {
    companion object{
        fun data() : ArrayList<Categories>{
            val cardList = ArrayList<Categories>()
            cardList.add(Categories("Wedding Categories from categories", cardData()))
            cardList.add(Categories("Engamenet Categories", engageData()))
            cardList.add(Categories("Engamenet Categories", savedData()))
            return cardList
        }

        fun cardData() : ArrayList<CardItem>{
            val cardList = ArrayList<CardItem>()
            cardList.add(CardItem(R.drawable.card1, 3000, false ))
            cardList.add(CardItem(R.drawable.card2, 2000, false ))
            cardList.add(CardItem(R.drawable.card3, 4000, false ))
            cardList.add(CardItem(R.drawable.card4, 1000, false ))
            cardList.add(CardItem(R.drawable.card5, 2000, false ))
            cardList.add(CardItem(R.drawable.card6, 2000, false ))
            return cardList
        }

        fun engageData() : ArrayList<CardItem>{
            val cardList = ArrayList<CardItem>()
            cardList.add(CardItem(R.drawable.card4, 1000, false ))
            cardList.add(CardItem(R.drawable.card5, 2000, false ))
            cardList.add(CardItem(R.drawable.card6, 2000, false ))
            cardList.add(CardItem(R.drawable.card1, 3000, false ))
            cardList.add(CardItem(R.drawable.card2, 2000, false ))
            cardList.add(CardItem(R.drawable.card3, 4000, false ))
            return cardList
        }

        fun savedData() : ArrayList<CardItem>{
            val cardList = ArrayList<CardItem>()
            cardList.add(CardItem(R.drawable.card6, 2000, false ))
            cardList.add(CardItem(R.drawable.card1, 3000, false ))
            cardList.add(CardItem(R.drawable.card4, 1000, false ))
            cardList.add(CardItem(R.drawable.card5, 2000, false ))
            cardList.add(CardItem(R.drawable.card2, 2000, false ))
            cardList.add(CardItem(R.drawable.card3, 4000, false ))
            return cardList
        }
    }



}