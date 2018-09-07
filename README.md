# o2offer
Consulta de ofertas geolocalizadas usando springboot e elasticsearch

## Mapping do elastic
Considerar o seguinte modelo:

```
PUT zo2om 
{
  "mappings": {
    "o2offer": { 
      "properties": { 
        "ean":      { "type": "keyword"  }, 
        "url":      { "type": "keyword"  }, 
        "storeId":  { "type": "integer" },
        "availability":      { "type": "keyword"  },
        "location": { "type": "geo_point" }
      }
    }
  }
}
```

## Exemplos de dados
```
PUT zo2om/o2offer/1
{
    "ean": "9788520002032",
    "url": "https://www.saraiva.com.br/historias-de-cronopios-e-de-famas-345031.html",
    "storeId": 123,
    "availability": "in_stock",
    "location" : { 
        "lat" : -23.0028463,
        "lon" : -43.3598523
    }
}
```

```
PUT zo2om/o2offer/2
{
    "ean": "9788520002032",
    "url": "https://www.saraiva.com.br/historias-de-cronopios-e-de-famas-345031.html",
    "storeId": 123,
    "availability": "in_stock",
    "location" : { 
        "lat" : -23.0057813,
        "lon" : -43.3228642
    }
}
```
